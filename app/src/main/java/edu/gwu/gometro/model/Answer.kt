package edu.gwu.gometro.model

/**
 * Created by chenlanhao105 on 2017/9/18.
 */
data class Answer(val wrongAnswers: List<Answer>, val correctAnswer:Answer)