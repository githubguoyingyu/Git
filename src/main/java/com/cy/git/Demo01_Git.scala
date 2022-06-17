package com.cy.git

/**
 * @Author 未至终局
 * @Date 2022/6/17 19:52
 * @Version 1.0
 */
object Demo01_Git {
  def main(args: Array[String]): Unit = {
    println("hello git")
    println("hello git2")
    println("hello git3")
    //>>>>>>>>>>分支创建及切换>>>>>>>>>>>>>>>>
    //右键项目 new Branch 创建分支
    //右下角的 master 也可以用来点击创建分支
    //勾选checkout 创建并切换到该分支
    //创建了一个 hot-fix 分支并切换到该分支
    //切换其他分支也是同理 点击右下角即可 选择分支 checkout即可
    //当前代码所属分支 查看右下角即可
    //>>>>>>>>>>分支合并>>>>>>>>>>>>>>>>
    //切换hot-fix分支添加 hello g4
    println("hello git4")
    //提交该代码 hot-fix commit1
    //切换回master 发现没有这些注释与代码
    //然后回到hot-fix 提交下注释再回到master进行合并 merge into current
    //以上代码正常合并 冲突合并分别再master与hot-fix增加代码并分别提交 然后再合并
    println("hello master")

  }
}
