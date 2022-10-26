/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package globalcoding.spring.core.cyclic;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author gloding
 */
@AllArgsConstructor
@Data
public class CyclicB {
    private CyclicC cyclicC;
}
