package com.shri.neuralnet.functions.activation.impl;

import com.shri.neuralnet.functions.activation.ActivationFunction;

public class LeakyReLUFunction implements ActivationFunction
{

    @Override
    public Double calculate(Double input)
    {
        return input < 0 ? 0.01 * input : input;
    }

}
