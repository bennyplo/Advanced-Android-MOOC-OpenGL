package com.bennyplo.openglpipeline;

import android.content.Context;
import android.opengl.GLSurfaceView;

public class MyView extends GLSurfaceView {
    private final MyRenderer mRenderer;
    public MyView(Context context) {
        super(context);
        setEGLContextClientVersion(2);// Create an OpenGL ES 2.0 context.
        mRenderer = new MyRenderer();// Set the Renderer for drawing on the GLSurfaceView
        setRenderer(mRenderer);
        // Render the view only when there is a change in the drawing data
        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
