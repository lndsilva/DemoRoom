package br.com.local.demoroom.persistencia.dao;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

import br.com.local.demoroom.persistencia.entidades.Trofeu;
import br.com.local.demoroom.persistencia.entidades.Usuario;

@Dao
public interface TrofeuDAO {

    @Query("SELECT * from trofeu")
    List<Trofeu> buscaTrofeu();


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void adicionarTrofeu(Trofeu... trofeu);

    @Delete
    void deleteTrofeu(Trofeu... trofeu);

}
