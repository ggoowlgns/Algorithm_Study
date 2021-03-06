package ParkJiHoon.FirstWeek;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public static void main(String args[]) throws Exception
    {
		/*
		   아래의 메소드 호출은 앞으로 표준 입력(키보드) 대신 input.txt 파일로부터 읽어오겠다는 의미의 코드입니다.
		   여러분이 작성한 코드를 테스트 할 때, 편의를 위해서 input.txt에 입력을 저장한 후,
		   이 코드를 프로그램의 처음 부분에 추가하면 이후 입력을 수행할 때 표준 입력 대신 파일로부터 입력을 받아올 수 있습니다.
		   따라서 테스트를 수행할 때에는 아래 주석을 지우고 이 메소드를 사용하셔도 좋습니다.
		   단, 채점을 위해 코드를 제출하실 때에는 반드시 이 메소드를 지우거나 주석 처리 하셔야 합니다.
		 */
        //System.setIn(new FileInputStream(&quot;res/input.txt&quot;));

		/*
		   표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어옵니다.
		 */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T;
        T=Integer.parseInt(br.readLine());
		/*
		   여러 개의 테스트 케이스가 주어지므로, 각각을 처리합니다.
		*/
        List<Integer> res = new ArrayList<>();
        for(int test_case = 1; test_case <= T; test_case++)
        {

            /////////////////////////////////////////////////////////////////////////////////////////////
			/*
				 이 부분에 여러분의 알고리즘 구현이 들어갑니다.
			 */
            /////////////////////////////////////////////////////////////////////////////////////////////
            int N = Integer.parseInt(br.readLine());
            int[] An = new int[N];
            String[] line = br.readLine().split(" ");
            for(int i= 0 ; i<N; i++) An[i] = Integer.parseInt(line[i]);
            res.add(caculator(An));

        }
        int test_case = 1;
        for(Integer a : res){
            System.out.println("#"+test_case+" "+a);
            test_case++;
        }
    }

    public static int caculator(int[] An){
        int ret = 0;
        for(int a : An){
            ret = Math.max(ret+a,ret*a);
        }

        return ret;
    }

    //Brute Force 할필요도 없음..
   /* public static int cal_plusOrMult(int[] An, int arr_idx,int res){
        //base case 계산 다함
//        if(arr_idx)

        for(int i=0 ; i<2 ; i++){//더하기 or 곱하기
            int temp_res = res;
            switch (i){
                case 0://더하기
                    res += An[arr_idx];
                    break;
                case 1://곱하기
            }       res = res*An[arr_idx];
        }

        return res;
    }*/

}
