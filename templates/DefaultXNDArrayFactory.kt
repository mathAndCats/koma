/**
 * THIS FILE IS AUTOGENERATED, DO NOT MODIFY. EDIT THE FILES IN templates/
 * AND RUN ./gradlew :codegen INSTEAD!
 */

package ${namespace}.ndarray

import koma.extensions.fill
import koma.ndarray.*

class Default${dtype}NDArrayFactory: NumericalNDArrayFactory<${dtype}> {
    override fun alloc(lengths: IntArray) = Default${dtype}NDArray(lengths)

    override fun zeros(vararg lengths: Int) = alloc(lengths).fill { 0${literalSuffix} }

    override fun ones(vararg lengths: Int) = alloc(lengths).fill { 1${literalSuffix} }

    override fun rand(vararg lengths: Int) = alloc(lengths).fill {
        koma.internal.getRng().nextDouble().to${dtype}()
    }

    override fun randn(vararg lengths: Int) = alloc(lengths).fill {
        koma.internal.getRng().nextGaussian().to${dtype}()
    }
}
