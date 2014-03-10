package com.example.sdk_demo;

import android.widget.LinearLayout;
import com.onyx.android.sdk.data.util.FileUtil;
import com.onyx.android.sdk.reader.PagingMode;
import com.onyx.android.sdk.ui.dialog.data.IReaderMenuHandler;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: zhuzeng
 * Date: 3/10/14
 * Time: 2:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class EInkReaderMenuHandler implements IReaderMenuHandler {

    private MyActivity readerActivity;

    public EInkReaderMenuHandler(MyActivity readerActivity)
    {
        this.readerActivity = readerActivity;
    }

    @Override
    public int getPageIndex() {
        return 0;
    }

    @Override
    public int getPageCount() {
        return 100;
    }

    @Override
    public String getBookName() {
        return FileUtil.getFileNameByPath("a.txt");
    }

    @Override
    public boolean canPreviousNavigation() {
        return false;
    }

    @Override
    public void previousNavigation() {

    }

    @Override
    public boolean canNextNavigation() {
        return false;
    }

    @Override
    public void nextNavigation() {

    }

    @Override
    public boolean canNextPage() {
        return false;
    }

    @Override
    public void nextPage() {

    }

    @Override
    public boolean canPreviousPage() {
        return false;
    }

    @Override
    public void previousPage() {

    }

    @Override
    public void gotoPage(int i) {

    }

    @Override
    public void updateCurrentPage(LinearLayout l) {

    }

    @Override
    public boolean canSmartReflow() {
        return false;
    }

    @Override
    public boolean isSmartReflow() {
        return false;
    }

    @Override
    public void setSmartReflow(boolean enable) {

    }

    @Override
    public void increaseFontSize() {

    }

    @Override
    public void decreaseFontSize() {

    }

    @Override
    public void changeFontsize(FontSizeProperty property) {

    }

    @Override
    public boolean isFontEmboldenOn() {
        return false;
    }

    @Override
    public void toggleFontEmbolden() {

    }

    @Override
    public void showSetFontView() {

    }

    @Override
    public String getFontFace() {
        return null;
    }

    @Override
    public void setFontFace() {

    }

    @Override
    public void rotationScreen(int i) {

    }

    @Override
    public void changeRotationScreen(int orientation) {
        readerActivity.setRequestedOrientation(orientation);
    }

    @Override
    public void showLineSpacingView() {

    }

    @Override
    public void setLineSpacing(LineSpacingProperty property) {

    }

    @Override
    public void showTOC() {

    }

    @Override
    public void showBookMarks() {

    }

    @Override
    public void showTTsView() {

    }

    @Override
    public void showAnnotation() {

    }

    @Override
    public void searchContent() {

    }

    @Override
    public void searchContent(String query) {

    }

    @Override
    public void startDictionary() {

    }

    @Override
    public void showGoToPageDialog() {

    }

    @Override
    public ArrayList<PagingMode> getReadingModeSupportList() {
        return null;
    }

    @Override
    public PagingMode getReadingMode() {
        return null;
    }

    @Override
    public void setReadingMode(PagingMode mode) {

    }

    @Override
    public void zoomToPage() {

    }

    @Override
    public void zoomToWidth() {

    }

    @Override
    public void zoomToHeight() {

    }

    @Override
    public void zoomBySelection() {

    }

    @Override
    public void zoomByTwoPoints() {

    }

    @Override
    public void zoomByValue(double z) {

    }

    @Override
    public void zoomIn() {

    }

    @Override
    public void zoomOut() {

    }

    @Override
    public void toggleFullscreen() {

    }

    @Override
    public boolean showZoomSettings() {
        return true;
    }

    @Override
    public boolean showSpacingSettings() {
        return false;
    }

    @Override
    public boolean canChangeFontFace() {
        return false;
    }

    @Override
    public boolean isFullscreen() {
        return false;
    }

    @Override
    public void setScreenRefresh() {

    }

    @Override
    public void showReaderSettings() {

    }

    @Override
    public boolean ttsIsSpeaking() {
        return false;
    }

    @Override
    public void ttsInit() {

    }

    @Override
    public void ttsSpeak() {

    }

    @Override
    public void ttsPause() {

    }

    @Override
    public void ttsStop() {

    }
}