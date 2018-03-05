package com.example.visitante.proyectofinal.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.visitante.proyectofinal.entities.Usuario;

import java.util.List;

/**
 * Created by Visitante on 5/03/2018.
 */

public interface Userdao {
    @Query("Select * from Usuario")
    LiveData<List<Usuario>> getAll();

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert (Usuario user);
}
