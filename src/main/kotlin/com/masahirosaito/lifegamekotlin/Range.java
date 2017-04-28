package com.masahirosaito.lifegamekotlin;

/**
 * Range用クラス(IntStreamが使いにくかったので)
 *
 * @see http://d.hatena.ne.jp/torutk/20110924/p1
 */
class Range<T extends Comparable> {
    T lowerBound;
    T upperBound;

    /**
     * Constructor
     */
    Range(T lowerBound, T upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    boolean includes(T value) {
        return lowerBound.compareTo(value) <= 0 && value.compareTo(upperBound) <= 0;
    }
}
