/**
 * THIS FILE IS AUTOGENERATED, DO NOT MODIFY. EDIT THE FILES IN templates/
 * AND RUN ./gradlew :codegen INSTEAD!
 */

package koma.internal.default.generated.ndarray

import koma.extensions.fill
import koma.ndarray.*

class DefaultLongNDArrayFactory: NumericalNDArrayFactory<Long> {
    override fun alloc(lengths: IntArray) = DefaultLongNDArray(lengths)

    override fun zeros(vararg lengths: Int) = alloc(lengths).fill { 0L }

    override fun ones(vararg lengths: Int) = alloc(lengths).fill { 1L }

    override fun rand(vararg lengths: Int) = alloc(lengths).fill {
        koma.internal.getRng().nextDouble().toLong()
    }

    override fun randn(vararg lengths: Int) = alloc(lengths).fill {
        koma.internal.getRng().nextGaussian().toLong()
    }
}
