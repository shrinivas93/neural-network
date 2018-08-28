package com.shri.neuralnet.functions.util;

import com.shri.neuralnet.functions.summing.InputSummingFunction;
import com.shri.neuralnet.functions.summing.impl.WeightedSquaredSumFunction;
import com.shri.neuralnet.functions.summing.impl.WeightedSumFunction;

public enum SummingFunctions
{

    WEIGHTED_SUM(new WeightedSumFunction()),
    WEIGHTED_SQUARED_SUM(new WeightedSquaredSumFunction());

    InputSummingFunction function;

    SummingFunctions(InputSummingFunction function)
    {
        this.function = function;
    }

    public InputSummingFunction getFunction()
    {
        return function;
    }

}
