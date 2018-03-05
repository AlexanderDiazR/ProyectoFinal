package com.example.visitante.proyectofinal.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Visitante on 5/03/2018.
 */

@Entity
public class partidos {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "Equipo1")
    private String Equipo1;

    @ColumnInfo(name = "Equipo2")
    private String Equipo2;

    @ColumnInfo(name = "Goles1")
    private int Goles1;

    @ColumnInfo(name = "Goles2")
    private int Goles2;

    @ColumnInfo(name = "Día")
    private String dia;

    @ColumnInfo(name = "Estado")
    private boolean Abierto;

    public partidos(int id, String equipo1, String equipo2, String dia) {
        this.id = id;
        Equipo1 = equipo1;
        Equipo2 = equipo2;
        this.dia = dia;
        Abierto = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipo1() {
        return Equipo1;
    }

    public void setEquipo1(String equipo1) {
        Equipo1 = equipo1;
    }

    public String getEquipo2() {
        return Equipo2;
    }

    public void setEquipo2(String equipo2) {
        Equipo2 = equipo2;
    }

    public int getGoles1() {
        return Goles1;
    }

    public void setGoles1(int goles1) {
        Goles1 = goles1;
    }

    public int getGoles2() {
        return Goles2;
    }

    public void setGoles2(int goles2) {
        Goles2 = goles2;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public boolean isAbierto() {
        return Abierto;
    }

    public void setAbierto(boolean abierto) {
        Abierto = abierto;
    }
}
