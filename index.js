// ImageView.js
import PropTypes from "prop-types";
import { View, requireNativeComponent, Platform } from "react-native";

/**
 * Composes `View`.
 *
 * - src: string
 * - borderRadius: number
 * - resizeMode: 'cover' | 'contain' | 'stretch'
 */
if (Platform.OS === "android") {
  module.exports = requireNativeComponent("RCTSuperView", {
    propTypes: {
      color: PropTypes.string,
      angle: PropTypes.number,
      distance: PropTypes.number,
      radius: PropTypes.number,
      ...View.propTypes
    }
  });
} else {
  module.exports = View;
}
