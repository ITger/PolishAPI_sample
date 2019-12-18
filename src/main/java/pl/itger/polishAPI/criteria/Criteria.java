/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.itger.polishAPI.criteria;

import java.util.List;

/**
 * @author new
 */
public interface Criteria {

    public <T> List<T> meetCriteria(List<T> elementy);

//public <T> T meetCriteria(List<T> elementy);

}
