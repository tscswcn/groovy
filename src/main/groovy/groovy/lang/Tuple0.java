/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package groovy.lang;

import groovy.util.function.Function0;

/**
 * Represents a list of 0 typed Object.
 *
 * @since 3.0.0
 */
public class Tuple0 extends Tuple {
    private static final long serialVersionUID = -3791115121904072346L;

    public Tuple0() {
    }

    public Tuple0(Tuple0 tuple) {
    }

    /**
     * Concatenate a value to this tuple.
     */
    public final <T1> Tuple1<T1> concat(T1 value) {
        return new Tuple1<>(value);
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1> Tuple1<T1> concat(Tuple1<T1> tuple) {
        return new Tuple1<>(tuple.v1());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2> Tuple2<T1, T2> concat(Tuple2<T1, T2> tuple) {
        return new Tuple2<>(tuple.v1(), tuple.v2());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3> Tuple3<T1, T2, T3> concat(Tuple3<T1, T2, T3> tuple) {
        return new Tuple3<>(tuple.v1(), tuple.v2(), tuple.v3());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> concat(Tuple4<T1, T2, T3, T4> tuple) {
        return new Tuple4<>(tuple.v1(), tuple.v2(), tuple.v3(), tuple.v4());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> concat(Tuple5<T1, T2, T3, T4, T5> tuple) {
        return new Tuple5<>(tuple.v1(), tuple.v2(), tuple.v3(), tuple.v4(), tuple.v5());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> concat(Tuple6<T1, T2, T3, T4, T5, T6> tuple) {
        return new Tuple6<>(tuple.v1(), tuple.v2(), tuple.v3(), tuple.v4(), tuple.v5(), tuple.v6());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> concat(Tuple7<T1, T2, T3, T4, T5, T6, T7> tuple) {
        return new Tuple7<>(tuple.v1(), tuple.v2(), tuple.v3(), tuple.v4(), tuple.v5(), tuple.v6(), tuple.v7());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> concat(Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> tuple) {
        return new Tuple8<>(tuple.v1(), tuple.v2(), tuple.v3(), tuple.v4(), tuple.v5(), tuple.v6(), tuple.v7(), tuple.v8());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> concat(Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> tuple) {
        return new Tuple9<>(tuple.v1(), tuple.v2(), tuple.v3(), tuple.v4(), tuple.v5(), tuple.v6(), tuple.v7(), tuple.v8(), tuple.v9());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> concat(Tuple10<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10> tuple) {
        return new Tuple10<>(tuple.v1(), tuple.v2(), tuple.v3(), tuple.v4(), tuple.v5(), tuple.v6(), tuple.v7(), tuple.v8(), tuple.v9(), tuple.v10());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> concat(Tuple11<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11> tuple) {
        return new Tuple11<>(tuple.v1(), tuple.v2(), tuple.v3(), tuple.v4(), tuple.v5(), tuple.v6(), tuple.v7(), tuple.v8(), tuple.v9(), tuple.v10(), tuple.v11());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> concat(Tuple12<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12> tuple) {
        return new Tuple12<>(tuple.v1(), tuple.v2(), tuple.v3(), tuple.v4(), tuple.v5(), tuple.v6(), tuple.v7(), tuple.v8(), tuple.v9(), tuple.v10(), tuple.v11(), tuple.v12());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> concat(Tuple13<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13> tuple) {
        return new Tuple13<>(tuple.v1(), tuple.v2(), tuple.v3(), tuple.v4(), tuple.v5(), tuple.v6(), tuple.v7(), tuple.v8(), tuple.v9(), tuple.v10(), tuple.v11(), tuple.v12(), tuple.v13());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> concat(Tuple14<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14> tuple) {
        return new Tuple14<>(tuple.v1(), tuple.v2(), tuple.v3(), tuple.v4(), tuple.v5(), tuple.v6(), tuple.v7(), tuple.v8(), tuple.v9(), tuple.v10(), tuple.v11(), tuple.v12(), tuple.v13(), tuple.v14());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> concat(Tuple15<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15> tuple) {
        return new Tuple15<>(tuple.v1(), tuple.v2(), tuple.v3(), tuple.v4(), tuple.v5(), tuple.v6(), tuple.v7(), tuple.v8(), tuple.v9(), tuple.v10(), tuple.v11(), tuple.v12(), tuple.v13(), tuple.v14(), tuple.v15());
    }

    /**
     * Concatenate a tuple to this tuple.
     */
    public final <T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> concat(Tuple16<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16> tuple) {
        return new Tuple16<>(tuple.v1(), tuple.v2(), tuple.v3(), tuple.v4(), tuple.v5(), tuple.v6(), tuple.v7(), tuple.v8(), tuple.v9(), tuple.v10(), tuple.v11(), tuple.v12(), tuple.v13(), tuple.v14(), tuple.v15(), tuple.v16());
    }

    /**
     * Split this tuple into two tuples of degree 0 and 0.
     */
    public final Tuple2<Tuple0, Tuple0> split0() {
        return new Tuple2<>(limit0(), skip0());
    }

    /**
     * Limit this tuple to degree 0.
     */
    public final Tuple0 limit0() {
        return this;
    }

    /**
     * Skip 0 degrees from this tuple.
     */
    public final Tuple0 skip0() {
        return this;
    }

    /**
     * Apply this tuple as arguments to a function.
     */
    public final <R> R map(Function0<? extends R> function) {
        return function.apply();
    }

    @Override
    public Tuple0 clone() {
        return new Tuple0(this);
    }
}
