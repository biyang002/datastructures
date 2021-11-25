package com.datastructures.maze;

/**
 * @Author biyang
 * @Date 2021/11/25 10:21 上午
 * @Version 1.0
 */

/**
 * 递归----迷宫问题
 */
public class MazeApp {
    public static void main(String[] args) {
        /*
        使用二维数组模拟迷宫
         */
        int[][] maze = new int[8][7];

        //设置第一行和最后一行为墙
        for (int i = 0; i < 7; i++) {
            maze[0][i]=1;
            maze[7][i]=1;
        }
        //设置两边为墙
        for (int i = 0; i < 7; i++) {
            maze[i][0] = 1;
            maze[i][6] = 1;
        }
        //设置障碍墙
        maze[3][2] = 1;
        maze[3][3] = 1;

        //打印查看迷宫
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
        isRun(1,1,maze);

        System.out.println("小球走的路线");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(maze[i][j]+" ");
            }
            System.out.println();
        }
    }
    /**
     * 递归方法
     * 1.小球从哪一个位置开始触发的，起始位置 1，1
     * 2.maze是地图对象
     * 3.当小球到达了6，5 结束
     * 4.元素为0时表示该位置没有走过，元素为1 表示是墙，元素为2时表示通过可以走，当元素为3时已经走过了，但是走不通
     */
    public static boolean isRun(int i, int j, int[][] maze){
        if (maze[6][5]==2){
            return true;
        }else {
            if (maze[i][j] == 0){//没有走过该点
                maze[i][j] = 2;
                //路线优先级：下右上左
                if (isRun(i+1,j,maze)){
                    return true;
                }else if (isRun(i,j+1,maze)){
                    return true;
                }else if (isRun(i-1,j,maze)){
                    return true;
                }else if (isRun(i, j-1, maze)){
                    return true;
                }else {
                    maze[i][j]=3;
                    return false;
                }
            }else {
                return false;
            }
        }
    }



}
