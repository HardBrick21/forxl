import { Injectable } from '@nestjs/common';
import { InjectRedis, Redis } from '@nestjs-modules/ioredis';

@Injectable()
export class GameService {
  constructor(
    @InjectRedis()
    private readonly redis: Redis,
  ) {}
}
