package java.org.example;

import org.aion.avm.userlib.*;

import org.aion.avm.tooling.abi.Callable;

import javax.naming.Name;

public class Aionpractice
{
    private static AionList<String> NameList = new AionList<>();
    private static AionList<String> NameListCopy = new AionList<>();
    private static AionList<String> NameSubList = new AionList<>();

    @Callable
    public static void addname(String newname)
    {
        NameList.add(newname);
    }

    @Callable
    public static void remname(String newname)
    {
        NameList.remove(newname);
    }

    @Callable
    public static void clearlist()
    {
        NameList.clear();
    }

    @Callable
    public static boolean checkname(String name)
    {
        return NameList.contains(name);
    }

    @Callable
    public static boolean isempty()
    {
        return NameList.isEmpty()? true: false;
    }



}
