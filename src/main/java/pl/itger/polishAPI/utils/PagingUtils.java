package pl.itger.polishAPI.utils;

import org.jetbrains.annotations.NotNull;

import static org.bson.types.ObjectId.isValid;

public class PagingUtils {
    public final static String PREV = "UFJFVg";
    public final static String NEXT = "TkVYVA";
    @NotNull
    public static String getPaginationDir(String pageId) {
        return pageId.substring(0, 6);
    }

    @NotNull
    public static String getPageId(String pageId) {
        return pageId.substring(6);
    }

    public static boolean isPageIdValid(String pageId) {
        return pageId != null && !pageId.trim().isEmpty() && (pageId.contains(PagingUtils.NEXT) || pageId.contains(PagingUtils.PREV)) && pageId.trim().length() > 5 && isValid(pageId.substring(6));
    }
}
