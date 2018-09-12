package com.ajackson.intro;

import java.math.BigDecimal;
import java.util.logging.Logger;

public class Manager extends Employee {
  //private boolean StockOptionEligible;
  
  private static final Logger log = Logger.getLogger(Manager.class.getName());
  
  public Manager() {
    
  }
    
  public static void processStockOptions (int numberOfOptions, BigDecimal price) {
    log.info("I can't believe I got " + numberOfOptions + " options at $" + price.toPlainString() + "!"); 
  }
  
  public void awardStockOptions() {
    BigDecimal reallyCheapPrice = BigDecimal.valueOf(0.01);
    int numberOfOptions = 10000;
    processStockOptions(numberOfOptions, reallyCheapPrice);
  }
  
}
