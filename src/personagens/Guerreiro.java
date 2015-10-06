package personagens;

/*
 * Copyright (C) 2015 PedroRatto
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

/**
 *
 * @author PedroRatto
 */
public class Guerreiro extends Personagem {

    public Guerreiro(){
        
    }
    
    public void geraPersonagem()
    {
        super.geraPersonagem();
        this.setForca(this.getForca()+3);
        this.setHp(this.getHp()+(this.getForca()*2));
        this.setArmadura(this.getArmadura()+1);
    }
    
    @Override
    public int atacar()
    {
       return lancaDado(20)+this.getForca(); 
    }
    
    @Override
    public int defender()
    {
        return this.getArmadura()+this.getDestreza()+lancaDado(10);
    }
    
}
