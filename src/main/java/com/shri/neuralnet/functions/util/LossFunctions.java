package com.shri.neuralnet.functions.util;

import com.shri.neuralnet.functions.loss.LossFunction;
import com.shri.neuralnet.functions.loss.impl.SquaredErrorFunction;

public enum LossFunctions
{
    SQUARED_ERROR(new SquaredErrorFunction());

    LossFunction function;

    LossFunctions(LossFunction function)
    {
        this.function = function;
    }

    public LossFunction getFunction()
    {
        return function;
    }

}
