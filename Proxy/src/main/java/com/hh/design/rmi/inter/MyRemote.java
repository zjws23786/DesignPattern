package com.hh.design.rmi.inter;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by hjz on 2017/12/22 0022.
 */
public interface MyRemote extends Remote {

    public String sayHello() throws RemoteException;
}
