package personagens;

import java.util.Random;

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
public abstract class Personagem {
    private String nome;
    private int forca, destreza, inteligencia, hp, armadura;
    private Random rd = new Random();
    
    public Personagem()
    {
        // Construtor
    }
    
    public Personagem(String nome, int forca, int destreza, int inteligencia, int hp)
    {
        this.nome = nome;
        this.hp = hp;
        this.forca = forca;
        this.inteligencia = inteligencia;
    }
    
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public String getNome()
    {
        return this.nome;
    }
    
    public void setHp(int hp)
    {
        this.hp = hp;
    }
    
    public int getHp()
    {
        return this.hp;
    }
    
    public void setArmadura(int armadura)
    {
        this.armadura = armadura;
    }
    
    public int getArmadura()
    {
        return this.armadura;
    }
    
    public void setForca(int forca)
    {
        this.forca = forca;
    }
    
    public int getForca()
    {
        return this.forca;
    }
    
    public void setDestreza(int destreza)
    {
        this.destreza = destreza;
    }
    
    public int getDestreza()
    {
        return this.destreza;
    }
    
    public void setInteligencia(int inteligencia)
    {
        this.inteligencia = inteligencia;
    }
    
    public int getInteligencia()
    {
        return this.inteligencia;
    }
    
    public void geraPersonagem()
    {
        this.hp = rd.nextInt(40)+60;
        this.armadura = rd.nextInt(2)+1;
        this.forca = rd.nextInt(6)+5;
        this.destreza = rd.nextInt(6)+5;
        this.inteligencia = rd.nextInt(6)+5;
    }
    
    public abstract int atacar();
    public abstract int defender();
}
