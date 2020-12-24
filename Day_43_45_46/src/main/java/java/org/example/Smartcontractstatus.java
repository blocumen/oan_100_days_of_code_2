package java.org.example;

import avm.Blockchain.*;
import org.aion.avm.tooling.abi.Callable;
import org.aion.avm.tooling.abi.Initializable;


public class Smartcontractstatus
{

   @Initializable
    private static String status;

    @Callable
  public static String check(String mystr)
  {

        return status;
  }


}
