package it.slyce.messaging.message.messageItem.user.media;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import it.slyce.messaging.R;
import it.slyce.messaging.utils.CustomSettings;
import it.slyce.messaging.message.messageItem.master.media.MessageMediaViewHolder;
import it.slyce.messaging.view.image.PicassoRoundedImageView;

/**
 * Created by John C. Hunchar on 5/16/16.
 */
public class MessageUserMediaViewHolder extends MessageMediaViewHolder {

    public MessageUserMediaViewHolder(View itemView, CustomSettings customSettings) {
        super(itemView, customSettings);

        avatar = (ImageView) itemView.findViewById(R.id.message_user_media_image_view_avatar);
        media = (PicassoRoundedImageView) itemView.findViewById(R.id.message_user_media_picasso_rounded_image_view_media);
        initials = (TextView) itemView.findViewById(R.id.message_user_media_text_view_initials);
        timestamp = (TextView) itemView.findViewById(R.id.message_user_media_text_view_timestamp);
        avatarContainer = (ViewGroup) itemView.findViewById(R.id.message_user_media_view_group_avatar);
    }
}