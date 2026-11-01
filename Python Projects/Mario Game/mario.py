import pygame
import sys

# Screen and game constants
SCREEN_WIDTH = 800
SCREEN_HEIGHT = 600
FPS = 60

# Physics
GRAVITY = 0.8
JUMP_STRENGTH = -15
PLAYER_SPEED = 5

# Colors (R, G, B)
SKY = (135, 206, 235)
GROUND = (139, 69, 19)
PLATFORM = (160, 82, 45)
PLAYER_COLOR = (220, 20, 60)     # Mario red
ENEMY_COLOR = (101, 67, 33)      # Goomba brown
COIN_COLOR = (255, 215, 0)       # Gold coin
WHITE = (255, 255, 255)
BLACK = (0, 0, 0)


class Player(pygame.sprite.Sprite):
    def __init__(self, x, y):
        super().__init__()
        self.image = pygame.Surface((30, 40))
        self.image.fill(PLAYER_COLOR)
        self.rect = self.image.get_rect(topleft=(x, y))
        self.vel_x = 0
        self.vel_y = 0
        self.on_ground = False
        self.lives = 3
        self.score = 0

    def update(self, platforms):
        keys = pygame.key.get_pressed()

        self.vel_x = 0
        if keys[pygame.K_LEFT] or keys[pygame.K_a]:
            self.vel_x = -PLAYER_SPEED
        if keys[pygame.K_RIGHT] or keys[pygame.K_d]:
            self.vel_x = PLAYER_SPEED

        # Jump
        if (keys[pygame.K_SPACE] or keys[pygame.K_UP]) and self.on_ground:
            self.vel_y = JUMP_STRENGTH
            self.on_ground = False

        # Gravity
        self.vel_y += GRAVITY
        if self.vel_y > 12:
            self.vel_y = 12

        # Horizontal movement
        self.rect.x += self.vel_x
        self._collide(self.vel_x, 0, platforms)

        # Vertical movement
        self.rect.y += self.vel_y
        self.on_ground = False
        self._collide(0, self.vel_y, platforms)

    def _collide(self, dx, dy, platforms):
        for p in platforms:
            if self.rect.colliderect(p.rect):
                if dx > 0:
                    self.rect.right = p.rect.left
                if dx < 0:
                    self.rect.left = p.rect.right
                if dy > 0:
                    self.rect.bottom = p.rect.top
                    self.vel_y = 0
                    self.on_ground = True
                if dy < 0:
                    self.rect.top = p.rect.bottom
                    self.vel_y = 0


class Platform(pygame.sprite.Sprite):
    def __init__(self, x, y, w, h, color=PLATFORM):
        super().__init__()
        self.image = pygame.Surface((w, h))
        self.image.fill(color)
        self.rect = self.image.get_rect(topleft=(x, y))


class Coin(pygame.sprite.Sprite):
    def __init__(self, x, y):
        super().__init__()
        self.image = pygame.Surface((16, 16))
        self.image.fill(COIN_COLOR)
        self.rect = self.image.get_rect(topleft=(x, y))


class Enemy(pygame.sprite.Sprite):
    def __init__(self, x, y, patrol_distance=120):
        super().__init__()
        self.image = pygame.Surface((28, 28))
        self.image.fill(ENEMY_COLOR)
        self.rect = self.image.get_rect(topleft=(x, y))
        self.start_x = x
        self.patrol_distance = patrol_distance
        self.speed = 2
        self.direction = 1

    def update(self):
        self.rect.x += self.speed * self.direction

        if self.rect.x > self.start_x + self.patrol_distance:
            self.direction = -1
        elif self.rect.x < self.start_x:
            self.direction = 1


def build_level():
    platforms = pygame.sprite.Group()
    enemies = pygame.sprite.Group()
    coins = pygame.sprite.Group()

    # Ground
    platforms.add(
        Platform(0, SCREEN_HEIGHT - 40, SCREEN_WIDTH, 40, GROUND)
    )

    # Platforms
    platforms.add(Platform(150, 450, 120, 20))
    platforms.add(Platform(350, 380, 120, 20))
    platforms.add(Platform(550, 300, 120, 20))
    platforms.add(Platform(200, 220, 100, 20))

    # Enemies
    enemies.add(Enemy(400, SCREEN_HEIGHT - 68, 200))
    enemies.add(Enemy(160, 430, 100))

    # Coins
    coins.add(Coin(200, 420))
    coins.add(Coin(400, 350))
    coins.add(Coin(600, 270))
    coins.add(Coin(250, 190))

    player_start = (50, SCREEN_HEIGHT - 100)

    return platforms, enemies, coins, player_start


def main():
    pygame.init()

    screen = pygame.display.set_mode(
        (SCREEN_WIDTH, SCREEN_HEIGHT)
    )
    pygame.display.set_caption("Mario Game in Python")
    clock = pygame.time.Clock()

    font = pygame.font.SysFont("Arial", 22, bold=True)

    platforms, enemies, coins, player_start = build_level()
    player = Player(*player_start)

    running = True

    while running:
        clock.tick(FPS)

        # Events
        for event in pygame.event.get():
            if event.type == pygame.QUIT:
                running = False

            if (
                event.type == pygame.KEYDOWN
                and event.key == pygame.K_ESCAPE
            ):
                running = False

        # Update
        player.update(platforms)
        enemies.update()

        # Coin collection
        hit_coins = pygame.sprite.spritecollide(
            player,
            coins,
            True
        )
        player.score += len(hit_coins) * 10

        # Enemy collision
        if pygame.sprite.spritecollideany(player, enemies):
            player.lives -= 1
            player.rect.topleft = player_start
            player.vel_y = 0

        # Fall off map
        if player.rect.top > SCREEN_HEIGHT:
            player.lives -= 1
            player.rect.topleft = player_start
            player.vel_y = 0

        # Game over
        if player.lives <= 0:
            running = False

        # Draw
        screen.fill(SKY)

        platforms.draw(screen)
        coins.draw(screen)
        enemies.draw(screen)

        screen.blit(player.image, player.rect)

        hud = font.render(
            f"Score: {player.score}   Lives: {player.lives}",
            True,
            BLACK
        )

        screen.blit(hud, (10, 10))

        pygame.display.flip()

    # Game Over Screen
    screen.fill(BLACK)

    game_over = font.render(
        f"Game Over - Final Score: {player.score}",
        True,
        WHITE
    )

    screen.blit(
        game_over,
        game_over.get_rect(
            center=(SCREEN_WIDTH // 2, SCREEN_HEIGHT // 2)
        )
    )

    pygame.display.flip()
    pygame.time.wait(3000)

    pygame.quit()
    sys.exit()


if __name__ == "__main__":
    main()