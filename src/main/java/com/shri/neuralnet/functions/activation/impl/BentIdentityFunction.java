package com.shri.neuralnet.functions.activation.impl;

import com.shri.neuralnet.functions.activation.ActivationFunction;

public class BentIdentityFunction implements ActivationFunction
{

    @Override
    public Double calculate(Double input)
    {
        return (Math.sqrt(Math.pow(input, 2) + 1) - 1) / 2 + input;
    }

}
