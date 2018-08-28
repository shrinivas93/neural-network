package com.shri.neuralnet.functions.summing;

import java.util.List;

import com.shri.neuralnet.components.Connection;
import com.shri.neuralnet.functions.summing.impl.WeightedSquaredSumFunction;
import com.shri.neuralnet.functions.summing.impl.WeightedSumFunction;

public interface InputSummingFunction
{

    InputSummingFunction WEIGHTED_SUM = new WeightedSumFunction();

    InputSummingFunction WEIGHTED_SQUARED_SUM = new WeightedSquaredSumFunction();

    Double calculate(List<Connection> connections);

}
