package pl.HaniaKamil.MemySpring.models;

import java.util.List;

public interface MemDao {

    List<Mem> findAll();

    void addMem(Mem mem);

    List<Mem> findFavor();

}
