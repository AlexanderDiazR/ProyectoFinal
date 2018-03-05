import android.arch.persistence.room.Database;

import com.example.visitante.proyectofinal.entities.Apuestas;
import com.example.visitante.proyectofinal.entities.Usuario;
import com.example.visitante.proyectofinal.entities.partidos;

@Database(entities = {Usuario.class, Apuestas.class, partidos.class},version = 1 )
public abstract class AppDatabase {


}
