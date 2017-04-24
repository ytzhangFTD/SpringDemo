package com.ytzhang.test.组合;

/**
 * Administrator 2017/3/2
 *
 * 人有大脑，大脑是人的一个属性 这是组合（数据结构）
 * 同时属性针对接口实现，就符合了开闭原则，不需要修改内部代码结构即可扩展属性值
 */
public class Person {

    private Brain brain;

    public Brain getBrain() {
        return brain;
    }

    public void setBrain(Brain brain) {
        this.brain = brain;
    }

	public static void main(String[] args) {
		Person person=new Person();
		Brain brain=new SmartBrain();
		person.setBrain(brain);
		person.getBrain().run();
	}
}
