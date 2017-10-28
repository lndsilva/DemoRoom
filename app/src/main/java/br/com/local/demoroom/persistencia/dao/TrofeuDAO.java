package br.com.local.demoroom.persistencia.dao;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import br.com.local.demoroom.persistencia.entidades.Trofeu;
import br.com.local.demoroom.persistencia.entidades.Usuario;

@Dao
public interface TrofeuDAO {

    @Query("SELECT * from trofeu WHERE userId = :userId")
    List<Trofeu> buscaTrofeu(String userId);


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void adicionarTrofeu(Trofeu... trofeu);

    @Update(onConflict = OnConflictStrategy.REPLACE)
    void atualizaTrofeu(Trofeu trofeu);

    @Query("delete from trofeu where id = :id")
    void deleteTrofeu(Long id);

}
