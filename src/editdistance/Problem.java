/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package editdistance;

/**
 *
 * @author NOOR-MAULIDA
 */
public class Problem {
    private int[][] map;
    private int[][] arah;
    private int MAXSIZE_S;
    private int MAXSIZE_T;
    private int INF=20000;

    public Problem(int s, int t) {
        MAXSIZE_S=s;
        MAXSIZE_T=t;
        map=new int[MAXSIZE_S+1][MAXSIZE_T+1];
        arah=new int[MAXSIZE_S+1][MAXSIZE_T+1];
    }

    public void setMap() {
        for(int i=0; i<MAXSIZE_S; i++) {
            for(int j=0; j<MAXSIZE_T; j++) {
                map[i][j]=INF;
                arah[i][j]=0;
            }
        }
    }

    public void set() {
        for(int i=0; i<MAXSIZE_S; ) {
            for(int j=0; i<MAXSIZE_T; ) {
                map[i][j] = setProblem(i,j);
            }
        }
    }

    public int setProblem(int i, int j) {
        if(i==0 || j==0) {
            return 0;
        }
        if(i==0) {
            return setProblem(i-1, j)+1;
        }
        if(j==0) {
            return setProblem(i-1, j-1)+1;
        }

    }

    public int[][] getMap() {
        return map;
    }

    public void setMap(int[][] map) {
        this.map = map;
    }

    public int[][] getArah() {
        return arah;
    }

    public void setArah(int[][] arah) {
        this.arah = arah;
    }

    public int getMAXSIZE_S() {
        return MAXSIZE_S;
    }

    public void setMAXSIZE_S(int MAXSIZE_S) {
        this.MAXSIZE_S = MAXSIZE_S;
    }

    public int getMAXSIZE_T() {
        return MAXSIZE_T;
    }

    public void setMAXSIZE_T(int MAXSIZE_T) {
        this.MAXSIZE_T = MAXSIZE_T;
    }
}
