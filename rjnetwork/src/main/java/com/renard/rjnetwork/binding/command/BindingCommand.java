package com.renard.rjnetwork.binding.command;

/**
 * Created by Riven_rabbit on 2019/1/9
 */
public class BindingCommand<T> {
    private BindingAction execute;
    private BindingConsumer<T> consumer;
    private BindingFunction<Boolean>canExecute;

    public BindingCommand(BindingAction execute){
        this.execute=execute;
    }
    /**
     * @param execute 带泛型参数的命令绑定
     */
    public BindingCommand(BindingConsumer<T> execute) {
        this.consumer = execute;
    }

    /**
     * @param execute     触发命令
     * @param canExecute true则执行,反之不执行
     */
    public BindingCommand(BindingAction execute, BindingFunction<Boolean> canExecute) {
        this.execute = execute;
        this.canExecute = canExecute;
    }

    /**
     * @param execute     带泛型参数触发命令
     * @param canExecute true则执行,反之不执行
     */
    public BindingCommand(BindingConsumer<T> execute, BindingFunction<Boolean> canExecute) {
        this.consumer = execute;
        this.canExecute = canExecute;
    }

    /**
     * 执行BindingAction命令
     */
    public void execute() {
        if (execute != null && canExecute0()) {
            execute.call();
        }
    }

    /**
     * 执行带泛型参数的命令
     *
     * @param parameter 泛型参数
     */
    public void execute(T parameter) {
        if (consumer != null && canExecute0()) {
            consumer.call(parameter);
        }
    }

    /**
     * 是否需要执行
     *
     * @return true则执行, 反之不执行
     */
    private boolean canExecute0() {
        if (canExecute == null) {
            return true;
        }
        return canExecute.call();
    }
}
