import { Equipment } from './game.equipment';

export interface Role {
  name: string;
  hp: number;
  mp: number;
  att: number;
  def: number;
  equips: Array<Equipment>;
}
