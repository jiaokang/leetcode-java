package code.easy;

import java.util.List;

/**
 * @ Author     ：焦康
 * @ Date       ：Created in 16:03 2023-04-27
 * @ Description：
 */
public class CountMatches1773 {
    /**
     * 统计匹配检索规则的物品数量
     *
     * 给你一个数组 items ，其中 items[i] = [typei, colori, namei] ，描述第 i 件物品的类型、颜色以及名称。
     *
     * 另给你一条由两个字符串 ruleKey 和 ruleValue 表示的检索规则。
     *
     * 如果第 i 件物品能满足下述条件之一，则认为该物品与给定的检索规则 匹配 ：
     *
     * ruleKey == "type" 且 ruleValue == typei 。
     * ruleKey == "color" 且 ruleValue == colori 。
     * ruleKey == "name" 且 ruleValue == namei 。
     * 统计并返回 匹配检索规则的物品数量 。
     *
     *
     *
     * 示例 1：
     *
     * 输入：items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
     * 输出：1
     * 解释：只有一件物品匹配检索规则，这件物品是 ["computer","silver","lenovo"] 。
     * 示例 2：
     *
     * 输入：items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
     * 输出：2
     * 解释：只有两件物品匹配检索规则，这两件物品分别是 ["phone","blue","pixel"] 和 ["phone","gold","iphone"] 。注意，["computer","silver","phone"] 未匹配检索规则。
     *
     *
     * 提示：
     *
     * 1 <= items.length <= 104
     * 1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10
     * ruleKey 等于 "type"、"color" 或 "name"
     * 所有字符串仅由小写字母组成
     */
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            if ("type".equals(ruleKey)){
                if (ruleValue.equals(item.get(0))){
                    count++;
                }
            }
            if ("color".equals(ruleKey)){
                if (ruleValue.equals(item.get(1))){
                    count++;
                }
            }
            if ("name".equals(ruleKey)){
                if (ruleValue.equals(item.get(2))){
                    count++;
                }
            }
        }
        return count;
    }
}
