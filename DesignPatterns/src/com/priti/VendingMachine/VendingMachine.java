package com.priti.VendingMachine;

import java.util.List;

/**
 * Created by prguleri on 11/22/2017.
 */
public interface VendingMachine {

    public long selectItemAndGetPrice(Item item);

    public void insertCoin(Coin coin);

    public List<Coin> refund();

    public Bucket<Item,List<Coin>> collectItemAndChange();

    public void reset();
}
