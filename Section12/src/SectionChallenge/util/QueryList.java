package SectionChallenge.util;

import SectionChallenge.util.QueryItem;

import java.util.ArrayList;
import java.util.List;

public class QueryList<T extends QueryItem> extends ArrayList<T> {

    public QueryList() {}

    public QueryList(List<T> items) {
        super(items);
    }

    public QueryList<T> getMatches(String field, String value) {
        QueryList<T> matches = new QueryList<>();
        for (var item : this) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }

        return matches;
    }

    public static <S extends QueryItem> List<S> getMatches(List<S> items, String field, String value) {
        List<S> matches = new ArrayList<>();
        for (var item : items) {
            if (item.matchFieldValue(field, value)) {
                matches.add(item);
            }
        }

        return matches;
    }
}
