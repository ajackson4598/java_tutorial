package com.ajackson.intro;

import static org.junit.Assert.*;
import org.junit.Test;

public class ManagerTest {

  @Test
  public void testCalculateAndAwardStockOptions() {
    Manager soe = new Manager();// perfectly valid
    calculateAndAwardStockOptions(soe);
    calculateAndAwardStockOptions(new Manager());// works too
    }
  
    public static void calculateAndAwardStockOptions(Manager soe) {
    soe.awardStockOptions();
  }
    
} //end ManagerTest 
