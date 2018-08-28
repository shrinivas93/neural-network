package com.shri.neuralnet.functions.activation.impl;

import com.shri.neuralnet.functions.activation.ActivationFunction;

public class SinusoidFunction implements ActivationFunction
{

    @Override
    public Double calculate(Double input)
    {
        return Math.sin(input);
    }

}
