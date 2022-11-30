package programmers.Lv0_problems;
//        int[] common1 = {1,2,3,4};
//                WhatNext.solution(common1);
//
//                int[] common2 = {2,4,8};
//                WhatNext.solution(common2);

public class WhatNext {

    public int solution(int[] common) {
        if (common[2] + common[0] == common[1] * 2) {
            return common[common.length - 1] + (common[1] - common[0]);
        }
        return common[common.length - 1] * (common[1] / common[0]);
    }
}
