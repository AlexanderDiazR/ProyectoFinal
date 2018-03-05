package com.example.visitante.proyectofinal.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Visitante on 5/03/2018.
 */

@Entity
public class Apuestas {

    @PrimaryKey (autoGenerate = true)
    private int id;

    @ColumnInfo(name = "User_ID")
    private int uid;

    @ColumnInfo(name = "Partida_ID")
    private int pid;

    @ColumnInfo(name = "Goles1")
    private int Goles1;

    @ColumnInfo(name = "Goles2")
    private int Goles2;

    @ColumnInfo(name = "Puntos")
    private int puntos;

    public Apuestas(int id, int uid, int pid, int goles1, int goles2) {
        this.id = id;
        this.uid = uid;
        this.pid = pid;
        Goles1 = goles1;
        Goles2 = goles2;
        puntos = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
