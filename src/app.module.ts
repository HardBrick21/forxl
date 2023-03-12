import { Module } from '@nestjs/common';
import { AppController } from './controller/app.controller';
import { AppService } from './app.service';
import { GameModule } from './game/game.module';
import { RedisModule } from '@nestjs-modules/ioredis';

@Module({
  imports: [
    GameModule,
    RedisModule.forRootAsync({
      useFactory: () => ({
        config: {
          url: 'redis://localhost:6379',
        },
      }),
    }),
  ],
  controllers: [AppController],
  providers: [AppService],
})
export class AppModule {}
