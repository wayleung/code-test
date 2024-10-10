package com.way.test;

import java.util.Stack;

/**
 * 写一个计算器类（Calculator），可以实现两个数的加、减、乘、除运算，并可以进行undo和redo操作，侯选人可在实现功能的基础上发挥最优设计，编写后请提供代码或者github地址
 * 备注：undo和redo 就是 撤销和重做的操作
 *
 * @author wayleung
 * @date 2024/10/10
 *
 * 可以优化为位运算
 */
public class Calculator {
    // 当前计算结果
    private double nowValue;
    // 用于保存撤销操作的历史
    private Stack<Double> undoStack;
    // 用于保存重做操作的历史
    private Stack<Double> redoStack;

    public Calculator() {
        this.nowValue = 0;
        this.undoStack = new Stack<>();
        this.redoStack = new Stack<>();
    }

    /**
     * 加法
     * @param num1
     * @param num2
     * @return
     */
    public double add(double num1, double num2) {
        saveState(); // 保存当前状态以支持撤销
        nowValue = num1 + num2;
        clearRedo(); // 清空redo栈
        return nowValue;
    }

    /**
     * 减法
     * @param num1
     * @param num2
     * @return
     */
    public double sub(double num1, double num2) {
        saveState();
        nowValue = num1 - num2;
        clearRedo();
        return nowValue;
    }

    /**
     * 乘法
     * @param num1
     * @param num2
     * @return
     */
    public double mul(double num1, double num2) {
        saveState();
        nowValue = num1 * num2;
        clearRedo();
        return nowValue;
    }

    /**
     * 除法
     * @param num1
     * @param num2
     * @return
     */
    public double div(double num1, double num2) {
        if (num2 != 0) {
            saveState();
            nowValue = num1 / num2;
            clearRedo();
            return nowValue;
        } else {
            throw new ArithmeticException("不能除以0");
        }
    }

    /**
     * 获取当前计算结果
     * @return
     */
    public double getNowValue() {
        return nowValue;
    }

    /**
     *  撤销（Undo）操作
     */
    public void undo() {
        if (!undoStack.isEmpty()) {
            // 先保存当前状态到redo栈
            redoStack.push(nowValue);
            // 恢复上一个状态
            nowValue = undoStack.pop();
        } else {
            System.out.println("无撤销（Undo）操作");
        }
    }

    /**
     * 重做（Redo）操作
     */
    public void redo() {
        if (!redoStack.isEmpty()) {
            // 先保存当前状态到undo栈
            undoStack.push(nowValue);
            // 恢复redo栈中的状态
            nowValue = redoStack.pop();
        } else {
            System.out.println("无重做（Redo）操作");
        }
    }

    /**
     * 保存当前状态到undo栈
     */
    private void saveState() {
        undoStack.push(nowValue);
    }

    /**
     * 清空redo栈
     */
    private void clearRedo() {
        redoStack.clear();
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("加法 10 + 5 : " + calculator.add(10, 5));

        System.out.println("减法 10 - 2 : " + calculator.sub(10, 2));

        calculator.undo();
        System.out.println("撤销undo : " + calculator.getNowValue());

        calculator.redo();
        System.out.println("重做redo: " + calculator.getNowValue());

        System.out.println("乘法 5 * 6 : " + calculator.mul(5, 6));

        System.out.println("除法 20 / 4: " + calculator.div(20, 4));

        calculator.undo();
        System.out.println("重做redo : " + calculator.getNowValue());
    }
}
