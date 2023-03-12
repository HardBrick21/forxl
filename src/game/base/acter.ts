import { Equipment } from './game.equipment';
import { Role } from './game.role';

export class Acter implements Role {
  name: string;
  hp: number;
  mp: number;
  att: number;
  def: number;
  equips: Equipment[];

  constructor(name: string) {
    this.name = name;
    this.hp = 100;
    this.mp = 10;
    this.att = 2;
    this.def = 1;
  }
}
