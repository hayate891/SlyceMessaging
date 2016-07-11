package it.slyce.slyce_messaging.messenger.message.messageItem.user.text;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import it.slyce.slyce_messaging.R;
import it.slyce.slyce_messaging.messenger.utils.CustomSettings;
import it.slyce.slyce_messaging.messenger.message.messageItem.master.text.MessageTextViewHolder;

/**
 * Created by John C. Hunchar on 5/12/16.
 */
public class MessageUserTextViewHolder extends MessageTextViewHolder {

    public MessageUserTextViewHolder(View itemView, CustomSettings customSettings) {
        super(itemView, customSettings);

        avatar = (ImageView) itemView.findViewById(R.id.message_user_text_image_view_avatar);
        carrot = (ImageView) itemView.findViewById(R.id.message_user_text_image_view_carrot);
        initials = (TextView) itemView.findViewById(R.id.message_user_text_text_view_initials);
        text = (TextView) itemView.findViewById(R.id.message_user_text_text_view_text);
        timestamp = (TextView) itemView.findViewById(R.id.message_user_text_text_view_timestamp);
        avatarContainer = (ViewGroup) itemView.findViewById(R.id.message_user_text_view_group_avatar);
        bubble = (FrameLayout) itemView.findViewById(R.id.message_user_text_view_group_bubble);

        Drawable drawable = itemView.getContext().getDrawable(R.drawable.shape_rounded_rectangle_white);
        drawable.setColorFilter(customSettings.localBubbleBackgroundColor, PorterDuff.Mode.SRC_ATOP);
        bubble.setBackground(drawable);
        carrot.setColorFilter(customSettings.localBubbleBackgroundColor);
        text.setTextColor(customSettings.localBubbleTextColor);
        timestamp.setTextColor(customSettings.timestampColor);
    }
}