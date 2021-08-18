
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K.Dmitriy
 */
public class Hideout<T> {
    
    private T t;
    private List<T> list;
    public void putIntoHideout(T toHide){
        if(!list.contains(toHide)){
            list.add(toHide);
        }
    }
    
    public T takeFromHideout(){
        if(!list.isEmpty()){
            return list.get(list.size());
        } 
        return null;
    }
    
    public boolean isInHideout(T toHide){
        return list.contains(toHide);
    }
    
}
