package pl.HaniaKamil.MemySpring.models;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MemStaticDao implements MemDao {
    private static List<Mem> mems = new LinkedList<>();
    private static List<Mem> favourite;

    @Override
    public List<Mem> findAll() {
        return mems;
    }

    @Override
    public void addMem(Mem mem) {
        mems.add(mem);
    }

    @Override
    public List<Mem> findFavor() {
        favourite = new ArrayList<>();

        for (Mem mem : mems) {
            if (mem.isFavourite()) {
                favourite.add(mem);
            }
        }
        return favourite;
    }
}

