package org.example;

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.userlib.AionMap;

public class AirBnB
{
    private static AionMap<Integer,Flat> flats = new AionMap<>();

    static {
        for(int i=1;i<=3;i++){
            Flat f = new Flat();
            f.forsale=false;
            f.owner=Blockchain.getCaller();
            flats.put(i,f);

        }
    }
    @Callable
    public static void SellFlat(int flatnum){
        long Initial=Blockchain.getRemainingEnergy();
        Flat f =flats.get(flatnum);
        Blockchain.require(f.owner.equals(Blockchain.getCaller()));
        f.forsale=true;
        flats.put(flatnum,f);
        Blockchain.println("Energy used"+(Initial-Blockchain.getRemainingEnergy()));
    }
    @Callable
    public static void butFlat(int flatnum){
        long Initial=Blockchain.getRemainingEnergy();
        Flat f =flats.get(flatnum);
        Blockchain.require(f.forsale==true);
        f.owner=Blockchain.getCaller();
        f.forsale=false;
        flats.put(flatnum,f);
        Blockchain.println("Energy used"+(Initial-Blockchain.getRemainingEnergy()));
    }

//    @Callable
//    public static boolean getFlatsaleStatus(int flatnum){
//        return flats.get(flatnum).forsale;
//    }
//    @Callable
//    public static Address getOwner(int flatnum){
//        return flats.get(flatnum).owner;
//    }


}
