package com.easyfitness;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.easyfitness.DAO.DatabaseHelper;
import com.easyfitness.licenses.CustomLicense;

import de.psdev.licensesdialog.LicensesDialog;
import de.psdev.licensesdialog.licenses.ApacheSoftwareLicense20;
import de.psdev.licensesdialog.licenses.GnuLesserGeneralPublicLicense21;
import de.psdev.licensesdialog.licenses.License;
import de.psdev.licensesdialog.licenses.MITLicense;
import de.psdev.licensesdialog.model.Notice;

public class AboutFragment extends Fragment {
	private String name; 
	private int id;
	private MainActivity mActivity=null;
	
	private TextView mpDBVersionTextView = null;
	private TextView mpMPAndroidChartTextView = null;
	private TextView mpjavaCVSTextView = null;
	private TextView mpLicenseDialogTextView = null;
	private TextView mpChronometerTextView = null;
	private TextView mpPagerSlidingTabStripTextView = null;
	private TextView mpSmartTabLayoutTextView = null;
	private TextView mpFlaticonTextView = null;
	private TextView mpFreepikView = null;
	private TextView mpCircleProgressView = null;
	private TextView mpCircularImageView = null;
    private TextView mpkToast = null;
    private TextView mpSweetAlertDialog = null;
    private TextView mpAndroidImageCropper = null;
    private TextView mpMaterialFavoriteButton = null;

	/**
     * Create a new instance of DetailsFragment, initialized to
     * show the text at 'index'.
     */
    public static AboutFragment newInstance(String name, int id) {
    	AboutFragment f = new AboutFragment();

        // Supply index input as an argument.
        Bundle args = new Bundle();
        args.putString("name", name);
        args.putInt("id", id);
        f.setArguments(args);

        return f;
    }

	@Override
	public void onAttach(Activity activity)
	{
		super.onAttach(activity);
		this.mActivity = (MainActivity) activity;
	}
	
	@Override 
	public View onCreateView(LayoutInflater inflater, ViewGroup container, 
			Bundle savedInstanceState) { 
		
		View view =  inflater.inflate(R.layout.tab_about, container, false);

		//TextView pAppVersion = view.findViewById(R.id.app_version_textview);
		//pAppVersion.setText(); TODO get code version from Manifest
				
		mpDBVersionTextView = view.findViewById(R.id.database_version);
		mpDBVersionTextView.setText(Integer.toString(DatabaseHelper.DATABASE_VERSION));

		mpMPAndroidChartTextView = view.findViewById(R.id.MPAndroidChart);
		mpjavaCVSTextView = view.findViewById(R.id.javaCSV);
		mpLicenseDialogTextView = view.findViewById(R.id.LicensesDialog);
		mpChronometerTextView = view.findViewById(R.id.antoniomChronometer);
		mpPagerSlidingTabStripTextView = view.findViewById(R.id.PagerSlidingTabStrip);

		mpSmartTabLayoutTextView = view.findViewById(R.id.SmartTabLayout);
		mpFlaticonTextView = view.findViewById(R.id.flaticonCredits);
		mpFreepikView = view.findViewById(R.id.freepikCredits);
		mpCircleProgressView = view.findViewById(R.id.CircleProgress);
		mpCircularImageView = view.findViewById(R.id.CircularImageView);
        mpkToast = view.findViewById(R.id.ktoast);
        mpSweetAlertDialog = view.findViewById(R.id.SweetAlertDialog);
        mpAndroidImageCropper = view.findViewById(R.id.AndroidImageCropper);
        mpMaterialFavoriteButton = view.findViewById(R.id.MaterialFavoriteButton);



		mpMPAndroidChartTextView.setOnClickListener(clickLicense);
		mpjavaCVSTextView.setOnClickListener(clickLicense);
		mpLicenseDialogTextView.setOnClickListener(clickLicense);
		mpChronometerTextView.setOnClickListener(clickLicense);
		mpPagerSlidingTabStripTextView.setOnClickListener(clickLicense);
		mpSmartTabLayoutTextView.setOnClickListener(clickLicense);
		mpFlaticonTextView.setOnClickListener(clickLicense);
		mpFreepikView.setOnClickListener(clickLicense);
		mpCircleProgressView.setOnClickListener(clickLicense);
		mpCircularImageView.setOnClickListener(clickLicense);
        mpkToast.setOnClickListener(clickLicense);
        mpSweetAlertDialog.setOnClickListener(clickLicense);
        mpAndroidImageCropper.setOnClickListener(clickLicense);
        mpMaterialFavoriteButton.setOnClickListener(clickLicense);

		// Inflate the layout for this fragment 
		return view;
	}

	public MainActivity getMainActivity() {
		return this.mActivity;
	}

	private View.OnClickListener clickLicense = new View.OnClickListener() {

		@Override
		public void onClick(View v) {

			String name = null;
			String url = null;
			String copyright = null;
			License license = null;

			switch(v.getId()) {
				case R.id.MPAndroidChart:
					name = "MPAndroidChart";
					url = "https://github.com/PhilJay/MPAndroidChart";
					copyright = "Copyright 2016 Philipp Jahoda";
					license = new ApacheSoftwareLicense20();
					break;
				case R.id.javaCSV:
					name = "javaCSV";
					url = "https://sourceforge.net/projects/javacsv/";
					copyright = "";
					license = new GnuLesserGeneralPublicLicense21();
					break;
				case R.id.antoniomChronometer:
					name = "Millisecond-Chronometer";
					url = "https://github.com/antoniom/Millisecond-Chronometer";
					copyright = "";
					license = new ApacheSoftwareLicense20();
					break;
				case R.id.LicensesDialog:
					name = "LicensesDialog";
					url = "https://psdev.de/LicensesDialog";
					copyright = "Copyright 2013 Philip Schiffer <admin@psdev.de>";
					license = new ApacheSoftwareLicense20();
					break;
				case R.id.PagerSlidingTabStrip:
					name = "PagerSlidingTabStrip";
					url = "https://github.com/astuetz/PagerSlidingTabStrip";
					copyright = "Andreas Stuetz - andreas.stuetz@gmail.com";
					license = new ApacheSoftwareLicense20();
					break;
				case R.id.SmartTabLayout:
					name = "SmartTabLayout";
					url = "https://github.com/ogaclejapan/SmartTabLayout";
					copyright = "";
					license = new ApacheSoftwareLicense20();
					break;
				case R.id.flaticonCredits:
					name = "Flaticon";
					url = "https://www.flaticon.com";
					copyright = "Flaticon";
					license = new CustomLicense("Free License (with attribution)", "https://profile.flaticon.com/license/free", "");
					break;
				case R.id.freepikCredits:
					name = "Freepik";
					url = "http://www.freepik.com";
					copyright = "Freepik";
					license = new CustomLicense("Free License (with attribution)", "https://github.com/lzyzsd/CircleProgress", "");
					break;
				case R.id.CircleProgress:
					name = "CircleProgress";
					url = "https://github.com/lzyzsd/CircleProgress";
					copyright = "lzyzsd";
					license = new CustomLicense("Free License", "https://github.com/lzyzsd/CircleProgress", "");
					break;
				case R.id.CircularImageView:
					name = "CircularImageView";
					url = "https://github.com/lopspower/CircularImageView";
					copyright = "Lopez Mikhael";
					license = new ApacheSoftwareLicense20();
					break;
                case R.id.ktoast:
                    name = "ktoast";
                    url = "https://github.com/onurkagan/KToast";
                    copyright = "Onurkagan";
                    license = new ApacheSoftwareLicense20();
                    break;
                case R.id.SweetAlertDialog:
                    name = "SweetAlertDialog";
                    url = "https://github.com/F0RIS/sweet-alert-dialog";
                    copyright = "Pedant (http://pedant.cn)";
                    license = new MITLicense();
                    break;
                case R.id.AndroidImageCropper:
                    name = "Android-Image-Cropper";
                    url = "https://github.com/ArthurHub/Android-Image-Cropper";
                    copyright = "Arthur Teplitzki";
                    license = new ApacheSoftwareLicense20();
                    break;
                case R.id.MaterialFavoriteButton:
                    name = "Material Favorite Button";
                    url = "https://github.com/IvBaranov/MaterialFavoriteButton";
                    copyright = "Ivan Baranov";
                    license = new ApacheSoftwareLicense20();
                    break;
			}


			final Notice notice = new Notice(name, url, copyright, license);
			new LicensesDialog.Builder(getMainActivity())
					.setNotices(notice)
					.build()
					.show();
		}
	};

}

