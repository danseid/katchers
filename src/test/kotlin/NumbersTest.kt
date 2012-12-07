/*
 * Copyright 2012 Daniel Seidler
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import org.junit.Test as test
import org.katchers.*

/**
 * @author Daniel Seidler
 * @since 2012/11/26
 */
public class NumbersTest {

    /**
     * Test Number.compare function
     */
    test fun compareNumbers() {
        val oneD = 1.0
        val oneF = oneD.toFloat()
        val oneI = oneD.toInt()
        val oneL = oneD.toLong()
        val oneS = oneD.toShort()
        val oneB = oneD.toByte()
        val onePointOneD = 1.1
        val onePointOneF = (1.1).toFloat()

        val oneList: List<Number> = arrayList<Number>(oneD, oneF, oneI, oneL, oneS, oneB)
        val onePointOneList: List<Number> = arrayList<Number>(onePointOneD, onePointOneF)
        for(n1 in oneList) for(n2 in oneList) {
            (n1 compare n2) should be equal 0
        }


        for(n1 in oneList) for(n2 in onePointOneList) {
                (n1 compare n2) should be equal -1
            }

        for(n1 in onePointOneList) for(n2 in oneList) {
                (n1 compare n2) should be equal 1
            }
    }

}